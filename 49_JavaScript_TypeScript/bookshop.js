var Author = /** @class */ (function () {
    function Author(id, firstName, lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    return Author;
}());
var Performer = /** @class */ (function () {
    function Performer(id, bandName) {
        this.id = id;
        this.bandName = bandName;
    }
    return Performer;
}());
var Publisher = /** @class */ (function () {
    function Publisher(id, name) {
        this.id = id;
        this.name = name;
    }
    return Publisher;
}());
var Genre = /** @class */ (function () {
    function Genre(id, genre) {
        this.id = id;
        this.genre = genre;
    }
    return Genre;
}());
var Style = /** @class */ (function () {
    function Style(id, name) {
        this.id = id;
        this.name = name;
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
var App = /** @class */ (function () {
    function App() {
        // create 'bookshop' with everything inside
        this.articles = [];
        this.creators = [];
        this.authors = [];
        this.publishers = [];
        this.genres = [];
        this.styles = [];
    }
    // create functions/methods for this bookshop
    App.prototype.addArticle = function (article) {
        this.articles.push(article);
    };
    App.prototype.removeArticle = function (id) {
        this.articles = this.articles.filter(function (article) { return article.id !== id; });
    };
    return App;
}());
