package com.app.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Station extends Base{
	private String station_name;

    @OneToMany(mappedBy = "station_id_boarding")
    private List<Routes> boardingRoutes;

    @OneToMany(mappedBy = "station_id_destination")
    private List<Routes> destinationRoutes;

}
