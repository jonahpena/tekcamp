const API_KEY = process.env.REACT_APP_API_KEY;

export function GetComment() {
  return fetch("https://dummyapi.io/data/v1/user?page=1&limit=15", {
    headers: {
      "app-id": API_KEY,
    },
  }).then((commentapi) => commentapi.json());
}
