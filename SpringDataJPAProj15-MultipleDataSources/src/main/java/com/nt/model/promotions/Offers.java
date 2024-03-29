package com.nt.model.promotions;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "MDS_OFFERS")
@NoArgsConstructor
@RequiredArgsConstructor
public class Offers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer offerId;
	@NonNull
	@Column(length = 20)
	private String offerName;
	@NonNull
	@Column(length = 20)
	private String offerCode;
	@NonNull
	private Double discountPercentage;
	@NonNull
	private LocalDateTime expiryDate;
	
	
}
