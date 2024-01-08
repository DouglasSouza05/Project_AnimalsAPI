import requests

name = 'fox'
api_url = 'https://api.api-ninjas.com/v1/animals?name={}'.format(name)
response = requests.get(api_url, headers={'X-Api-Key': '1/fQglp/19H5bdDx+vFf7A==xKa6MhH3R9bpA86q'})
if response.status_code == requests.codes.ok:
    print(response.text)
else:
    print("Error:", response.status_code, response.text)