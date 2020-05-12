import React from "react"

const StationInfo = (props) => {
	return (
		<div className="text-center">
			<h2>{props.station.name}</h2>
			<img className="img-tweaks" src={props.station.imageUrl} />
			<p className="lead bold-me">
				{props.station.name} is {props.station.lineName}
				{props.station.address}
			</p>
			<p className="lead">
				<span className="bold-me">My State: </span>
				{props.station.state}
			</p>
			<p className="text-center">
				<h2>Test Title{props.station.reviews.title}</h2>
				<h2>Test date {props.station.reviews.date}</h2>
			</p>
		</div>
	)
}

export default StationInfo
