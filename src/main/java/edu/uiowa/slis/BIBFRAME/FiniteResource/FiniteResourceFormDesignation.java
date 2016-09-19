package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceFormDesignationIterator theFiniteResource = (FiniteResourceFormDesignationIterator)findAncestorWithClass(this, FiniteResourceFormDesignationIterator.class);
			pageContext.getOut().print(theFiniteResource.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

