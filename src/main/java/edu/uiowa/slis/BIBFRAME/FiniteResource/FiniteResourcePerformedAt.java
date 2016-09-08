package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourcePerformedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourcePerformedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourcePerformedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourcePerformedAtIterator theFiniteResourcePerformedAtIterator = (FiniteResourcePerformedAtIterator)findAncestorWithClass(this, FiniteResourcePerformedAtIterator.class);
			pageContext.getOut().print(theFiniteResourcePerformedAtIterator.getPerformedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

