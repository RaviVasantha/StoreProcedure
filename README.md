In Database

create new Store procedure


//procedure for get book by author name
CREATE DEFINER=`root`@`localhost` PROCEDURE `get_books_by_Author`(in auth varchar(55))
BEGIN
select * from book_store where author=auth;
END
**********************************************************

//procedure for get book count by author name
CREATE DEFINER=`root`@`localhost` PROCEDURE `get_Book_Count`(in auth varchar(55),out authorBookCount int)
BEGIN
select count(*) as authorBookCount from book_store where author=auth; 
END
***********************************************************

//to call the method in DB
SELECT * FROM bookstore.book_store;
call get_books_by_Author("Shakesphere");

call get_Book_Count("Shakesphere",@total);
