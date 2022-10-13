package com.id.spring.app.models.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.id.spring.app.models.Pokemon;


@Component
public class PokemonService implements IPokemonService{
	
	@Override
	public List<Pokemon> quienEsEsePokemon() {
	
		Pokemon pokemoncito = new Pokemon();
		Pokemon pokemoncito2 = new Pokemon();
		
		List<Pokemon> listaPokemones = new ArrayList<>();
		pokemoncito.setNombre("Pikachu");
		pokemoncito.setTipo("Electrico");
		pokemoncito.setNivelPoder(43);
		pokemoncito.setHabilidad("Impactrueno");
		pokemoncito.setGenero('M');
		
		pokemoncito2.setNombre("Pikachu2");
		pokemoncito2.setTipo("Electrico");
		pokemoncito2.setNivelPoder(43);
		pokemoncito2.setHabilidad("Impactrueno");
		pokemoncito2.setGenero('M');
		
		listaPokemones.add(pokemoncito);
		listaPokemones.add(pokemoncito2);
		
		return listaPokemones;
	}

}
