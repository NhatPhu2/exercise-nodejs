const fetchAllContinent = (req, res) => {
  const listContinent = require("../fakedata/output.json");
  if (listContinent) res.send(listContinent);
  else res.sendStatus(404);
};

module.exports = {
  fetchAllContinent,
};
