import React from "react"
import { Link } from "react-router-dom"

const Station = (props) => {
	return (
		<div className="column">
			<div className="callout text-center">
				<Link to={`station/${props.id}`}>
					<h3>{props.name}</h3>
					<img className="img-radius" src={props.imageUrl} alt={props.name} />
				</Link>
				<p>
					{props.name} {props.network} {props.lineName}
				</p>
				<Link to={`station/${props.id}`} className="button expanded">
					Learn more about about this station
				</Link>
			</div>
		</div>
	)
}

export default Station
