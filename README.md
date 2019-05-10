Given a word (or phrase) search a given JSON object.
The purpose of this search is to return the title of a movie when a word or phrase is passed. The provided search term should be searched in all values of the object, returning the title(s) wherever the searched term is present.
At the end it should also show how many times the term was present.
Example JSON
[ { "title": "Avengers: Age of Ultron", "year": 2015, "cast": [ "Robert Downey, Jr.", "Chris Evans", "Chris Hemsworth", "Mark Ruffalo" ], "genres": [ "Action" ] }, { "title": "The Avengers", "year": 2012, "cast": [ "Robert Downey, Jr.", "Chris Evans", "Mark Ruffalo", "Chris Hemsworth", "Scarlett Johansson", "Jeremy Renner", "Tom Hiddleston", "Clark Gregg", "Cobie Smulders", "Stellan Skarsgård", "Samuel L. Jackson" ], "genres": [ "Superhero", "Action" ] }, { "title": "Life of Adam", "year": 2018, "cast": [ "Adam Smith" ], "genres": ["History"] } ] 
Example 1
Input: "Action" Output: Search Term: "Action" Movies: "Avengers: Age of Ultron", "The Avengers" count: 2 
