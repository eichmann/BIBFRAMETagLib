package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasFindingAid extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasFindingAid currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasFindingAid.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasFindingAidIterator theFiniteResourceHasFindingAidIterator = (FiniteResourceHasFindingAidIterator)findAncestorWithClass(this, FiniteResourceHasFindingAidIterator.class);
			pageContext.getOut().print(theFiniteResourceHasFindingAidIterator.getHasFindingAid());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

