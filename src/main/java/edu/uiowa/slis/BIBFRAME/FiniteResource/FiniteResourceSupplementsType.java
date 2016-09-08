package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceSupplementsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceSupplementsType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceSupplementsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceSupplementsIterator theFiniteResourceSupplementsIterator = (FiniteResourceSupplementsIterator)findAncestorWithClass(this, FiniteResourceSupplementsIterator.class);
			pageContext.getOut().print(theFiniteResourceSupplementsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for supplements tag ");
		}
		return SKIP_BODY;
	}
}

