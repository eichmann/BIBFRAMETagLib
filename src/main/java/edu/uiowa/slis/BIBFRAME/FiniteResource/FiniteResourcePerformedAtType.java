package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourcePerformedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourcePerformedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourcePerformedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourcePerformedAtIterator theFiniteResourcePerformedAtIterator = (FiniteResourcePerformedAtIterator)findAncestorWithClass(this, FiniteResourcePerformedAtIterator.class);
			pageContext.getOut().print(theFiniteResourcePerformedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

