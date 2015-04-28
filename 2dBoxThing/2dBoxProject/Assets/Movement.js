var moveSpeed:float = 1.0;
function Update () 
{
	if(Input.GetKeyDown(KeyCode.RightArrow)){
		transform.position.x += moveSpeed;
	}

	if(Input.GetKeyDown(KeyCode.UpArrow)) {
		transform.position.y += moveSpeed;
	}

	if(Input.GetKeyDown(KeyCode.DownArrow)) {
		transform.position.y -= moveSpeed;
	}

	if(Input.GetKeyDown(KeyCode.LeftArrow)){
		transform.position.x -= moveSpeed;
	}
	
	if(Input.GetKeyDown(KeyCode.KeypadPlus)){
		transform.localScale.x += moveSpeed;
		transform.localScale.y += moveSpeed;
	}
	
	if(Input.GetKeyDown(KeyCode.KeypadMinus)){
		transform.localScale.x -= moveSpeed;
		transform.localScale.y -= moveSpeed;
	}
		
	if(Input.GetKeyDown(KeyCode.PageUp)){
		transform.rotation.z += moveSpeed;
	}
	
	if(Input.GetKeyDown(KeyCode.PageDown)){
		transform.rotation.z -= moveSpeed;
	}
}