interface Article {

    id: number;
    price: number;

}

interface Creators {

    id: number
}

class Author implements Creators {
    constructor(
        public id: number,
        public firstName: string,
        public lastName: string
    ) {

    }
}

class Performer implements Creators {
    constructor(
        public id: number,
        public bandName: string
    ){

    }
}

class Publisher {

    constructor(
        public id: number,
        public name: string
    ) {

    }

}

class Genre {
    constructor(
        public id: number,
        public genre: string
    ){

    }

}

class Style {

    constructor(
        public id: number,
        public name: string
    ) {

    }

}

class Book implements Article {
 
    constructor(
        public id: number,    
        public price: number,
        public isbn: string,
        public title: string,
        public authors: Author[],
        public year: number,
        public publisher: Publisher,
        public genre: Genre
    ) {
        // it adds automatically
    }
}

class Album implements Article {
    constructor(
        public id: number,
        public price: number,
        public title: string,
        public performers: Performer[],
        public year: number,
        public publisher: Publisher[],
        public style: Style
    ) {

    }
}

class Supplies implements Article {
    
    constructor(
        public id: number,    
        public price: number,
        public name: string
    ){

    }

}

class App {
    // create 'bookshop' with everything inside
    public articles: Article[] = [];
    public creators: Performer[] = [];
    public authors: Author[] = [];
    public publishers: Publisher[] = [];
    public genres: Genre[] = [];
    public styles: Style[] = [];

    // create functions/methods for this bookshop
    public addArticle(article: Article): void {
        this.articles.push(article);
    }

    public removeArticle(id: number): void {
       this.articles = this.articles.filter(article => article.id !== id);
    }

}

