package com.example.pokemonproject.ui.model

data class Pokemon(
    val abilities: List<Ability>,
    val base_experience: Int,
    val forms: List<Form>,
    val height: Int,
    val id: Int,
    val is_default: Boolean,
    val location_area_encounters: String,
    val moves: List<Move>,
    val name: String,
    val order: Int,
    val species: Species,
    val sprites: Sprites,
    val stats: List<Stat>,
    val types: List<Type>,
    val weight: Int
)

data class Ability(
    val ability: AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)

data class AbilityX(
    val name: String,
    val url: String
)

data class Form(
    val name: String,
    val url: String
)

data class Move(
    val move: MoveX
)

data class MoveX(
    val name: String,
    val url: String
)

data class Species(
    val name: String,
    val url: String
)

data class Sprites(
    val back_default: String,
    val back_female: Any?,
    val back_shiny: String,
    val back_shiny_female: Any?,
    val front_default: String,
    val front_female: Any?,
    val front_shiny: String,
    val front_shiny_female: Any?
)

data class Stat(
    val base_stat: Int,
    val effort: Int,
    val stat: StatX
)

data class StatX(
    val name: String,
    val url: String
)

data class Type(
    val slot: Int,
    val type: TypeX
)

data class TypeX(
    val name: String,
    val url: String
)
