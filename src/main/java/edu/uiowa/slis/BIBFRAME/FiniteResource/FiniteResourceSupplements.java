package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceSupplements extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceSupplements currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceSupplements.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceSupplementsIterator theFiniteResourceSupplementsIterator = (FiniteResourceSupplementsIterator)findAncestorWithClass(this, FiniteResourceSupplementsIterator.class);
			pageContext.getOut().print(theFiniteResourceSupplementsIterator.getSupplements());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for supplements tag ");
		}
		return SKIP_BODY;
	}
}

