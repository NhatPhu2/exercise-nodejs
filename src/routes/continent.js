const express = require("express");
const router = express.Router();
const continentController = require("../controller/continent");

router.get("/continents", continentController.getAllContinent);
router.get("/continents/country",continentController.getContinentByCountry)
module.exports = router;
