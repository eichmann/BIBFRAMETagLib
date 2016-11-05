package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocationRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationRelationInverseIterator theLocationRelationInverseIterator = (LocationRelationInverseIterator)findAncestorWithClass(this, LocationRelationInverseIterator.class);
			pageContext.getOut().print(theLocationRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for relation tag ");
		}
		return SKIP_BODY;
	}
}

