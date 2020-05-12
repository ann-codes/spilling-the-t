import React from "react"
import { Link } from "react-router-dom"

const StationCard = (props) => {
	return (
		<div className="callout">
			<div className="media-object">
				<div className="media-object-section">
					<div className="thumbnail">
						<img
							className="img-thumb-resize"
							src={props.imageUrl}
							alt={props.name}
						/>
					</div>
				</div>
				<div className="media-object-section">
					<Link to={`station/${props.id}`}>
						<h3>{props.name} Station</h3>
					</Link>
					<p>
						{props.name} Station is in {props.state} in the {props.network}{" "}
						Network on the {props.lineName} Line.{" "}
						<Link to={`station/${props.id}`}>Learn more!</Link>
					</p>
				</div>
			</div>
		</div>
	)
}

export default StationCard
