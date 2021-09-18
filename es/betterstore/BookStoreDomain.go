package betterstore

import (
	"errors"
	"sync"
)

type Book struct {
	BookId string
	Title  string
	Price  int
	Count  int
}

type BookStoreDomain struct {
	sync.Mutex
	Books map[string]*Book
}

type AddCount struct {
	BookId string
	Count  int
}

func (s *BookStoreDomain) AddCount(request AddCount) (func(), error) {
	s.Lock()
	defer s.Unlock()

	book, ok := s.Books[request.BookId]
	if !ok {
		return nil, errors.New("failed")
	}
	if book.Count+request.Count < 0 {
		return nil, errors.New("failed")
	}

	rollback := func() {
		s.Lock()
		defer s.Unlock()
		book = s.Books[request.BookId]
		book.Count -= request.Count
	}
	book.Count += request.Count
	s.Books[request.BookId] = book

	return rollback, nil
}
