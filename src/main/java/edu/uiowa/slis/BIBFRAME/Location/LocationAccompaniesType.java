package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocationAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationAccompaniesIterator theLocationAccompaniesIterator = (LocationAccompaniesIterator)findAncestorWithClass(this, LocationAccompaniesIterator.class);
			pageContext.getOut().print(theLocationAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

