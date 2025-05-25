package model;

import client.db.enums.Genre;
import client.db.enums.Language;

public record Movie (String name, Long id, Language language, Genre genre){}
