import React from "react";

const StarMaker = (props) => {
  const n = Number(props.number);

  const stars = [...Array(n)].map((num, idx) => (
    <i className="fa fa-star" aria-hidden="true" key={idx}></i>
  ));

  return <span>{stars}</span>;
};

export default StarMaker;
