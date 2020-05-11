import React, { Fragment } from "react";
import { Link } from "react-router-dom";
const Sections = (props) => {
  return (
    <div className="grid-container">
      <div className="grid-x grid-margin-x small-up-2 medium-up-3">
        <div className="cell">
          <div className="card">
            <div className="card-section">
              <Link to="/admin/manage/stations">
                <img src="https://pngimage.net/wp-content/uploads/2018/06/train-station-icon-png-2.png" />
                <h4 className="align-center">Manage Stations</h4>
              </Link>
            </div>
          </div>
        </div>

        <div className="cell">
          <div className="card">
            <div className="card-section">
              <Link to="/admin/manage/reviews">
                <img src="https://library.kissclipart.com/20181217/gwe/kissclipart-evaluation-icon-png-clipart-computer-icons-c8a104f5b5542e62.png" />
                <h4 className="align-center">Manage Reviews</h4>
              </Link>
            </div>
          </div>
        </div>

        <div className="cell">
          <div className="card">
            <div className="card-section">
              <Link to="/admin/manage/users">
                <img src="https://pngimage.net/wp-content/uploads/2019/05/users-png-icon-.png" />
                <h4 className="align-center">User Stats</h4>
              </Link>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Sections;
