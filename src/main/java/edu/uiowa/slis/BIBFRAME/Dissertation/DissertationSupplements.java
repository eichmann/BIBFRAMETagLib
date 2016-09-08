package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationSupplements extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationSupplements currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationSupplements.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationSupplementsIterator theDissertationSupplementsIterator = (DissertationSupplementsIterator)findAncestorWithClass(this, DissertationSupplementsIterator.class);
			pageContext.getOut().print(theDissertationSupplementsIterator.getSupplements());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for supplements tag ");
		}
		return SKIP_BODY;
	}
}

