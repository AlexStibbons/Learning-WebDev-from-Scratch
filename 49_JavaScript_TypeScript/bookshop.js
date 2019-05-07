var Author = /** @class */ (function () {
    function Author(id, firstName, lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    return Author;
}());
var Performer = /** @class */ (function () {
    function Performer() {
    }
    return Performer;
}());
var Publisher = /** @class */ (function () {
    function Publisher() {
    }
    return Publisher;
}());
var Genre = /** @class */ (function () {
    function Genre() {
    }
    return Genre;
}());
var Style = /** @class */ (function () {
    function Style() {
    }
    return Style;
}());
var Book = /** @class */ (function () {
    function Book(id, price, isbn, title, authors, year, publisher, genre) {
        this.id = id;
        this.price = price;
        this.isbn = isbn;
        this.title = title;
        this.authors = authors;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        // it adds automatically
    }
    return Book;
}());
var Album = /** @class */ (function () {
    function Album(id, price, title, performers, year, publisher, style) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.performers = performers;
        this.year = year;
        this.publisher = publisher;
        this.style = style;
    }
    return Album;
}());
var Supplies = /** @class */ (function () {
    function Supplies(id, price, name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }
    return Supplies;
}());
