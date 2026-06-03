package com.java.data;

import java.util.List;

public record QAEngineer(String name,
                         int id,
                         double experience,
                         List<String> skillSet,
                         String location) {
}
