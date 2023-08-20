package com.app.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Station extends Base{
	
	@NotBlank(message = "Invalid Station Name")
	private String station_name;

    @OneToMany(mappedBy = "station_id_boarding")
    private List<Routes> boardingRoutes;

    @OneToMany(mappedBy = "station_id_destination")
    private List<Routes> destinationRoutes;

}
