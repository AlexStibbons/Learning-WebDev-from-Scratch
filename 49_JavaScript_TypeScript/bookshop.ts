interface Article {

    id: number;
    price: number;

}

class Author {
    constructor(
        public id: number,
        public firstName: string,
        public lastName: string,
    ) {

    }
}

class Performer {

    constructor(

    ){

    }

}

class Publisher {

}

class Genre {
    constructor(
        public id: number,
        public genre: string
    ){
        
    }

}

class Style {

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

