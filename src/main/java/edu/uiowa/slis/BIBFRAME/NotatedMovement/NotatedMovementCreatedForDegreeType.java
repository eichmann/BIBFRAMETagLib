package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementCreatedForDegreeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementCreatedForDegreeType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementCreatedForDegreeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementCreatedForDegreeIterator theNotatedMovementCreatedForDegreeIterator = (NotatedMovementCreatedForDegreeIterator)findAncestorWithClass(this, NotatedMovementCreatedForDegreeIterator.class);
			pageContext.getOut().print(theNotatedMovementCreatedForDegreeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

