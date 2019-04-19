/*  spec should always be singular, not multiple  */ 

/* lecture/exams */
var lecture = function(spec) { // parent to exam
    var that = {};

    that.code = spec.code;
    that.name = spec.name;
    that.espb = spec.espb;

    that.printLecture = function() {
        return "Code: " + that.code + "; Name: " + that.name
        + ", espb: " + that.espb;
    }

    return that;
}

var lecture1 = lecture({code:'code1', name:'lecture1', espb:'1'});
//console.log(lecture1);
console.log(lecture1.printLecture());

var exam = function(specLecture, specGrade) { // all in one spec; js can mix and match types
    var that = lecture(specLecture);
    that.grade = specGrade.grade;

    that.getExam = function() {
        return "Lecture: " + that.printLecture() + "; grade: " + that.grade;
    } 

    return that;
}


/*var exam = function(spec) { 
    var that = lecture(spec);
    that.grade = spec.grade;

    that.getExam = function() {
        return "Lecture: " + that.printLecture() + "; grade: " + that.grade;
    } 

    return that;
}*/

var exam1 = exam(lecture1, {grade:'1'});
//console.log(exam1);
console.log(exam1.getExam());

var exam2 = exam(lecture1,{grade:'5'});
//console.log(exam2);
console.log(exam2.getExam());

/* person/student */

var person = function(spec) { 
    var that = {};
    that.fName = spec.fName;
    that.lName = spec.lName;

    that.introduction = function() {
        return "First name: " + that.fName +
        ", Last name: " + that.lName; 
    };

    return that;
}

var person1 = person({fName:'name1', lName:'lName1'});
//console.log(person1);
console.log(person1.introduction());

var person2 = person({fName:'name12', lName:'lName2'});
//console.log(person2);
console.log(person2.introduction());

// student has person as prototype
var student = function(specPerson, specExams) { 
    var that = person(specPerson); 
    that.exams = specExams || []; 
    that.oldIntro = that.introduction;
    //making index
    student.counter = student.hasOwnProperty('counter')?(student.counter + 1):1;
    var index = student.counter;
    that.getIndex = function() {
        return index;
    }

    // instroduction super
    that.introduction = function() {
        return that.oldIntro() +
            ", index: " + that.getIndex();
    }

    return that;
}

var student1 = student(person1, {exam1, exam2});
//console.log(student1);
console.log(student1.introduction());

var student2 = student(person2, {exam1, exam2});
//console.log(student2);
console.log(student2.introduction());

/*  student service  */

var studentService = function() {

    var that = {};
    var students = [];
    var exams = [];

    var findIndex = function() {

    }

}