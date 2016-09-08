package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceSplitIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceSplitIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceSplitIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceSplitIntoIterator theFiniteResourceSplitIntoIterator = (FiniteResourceSplitIntoIterator)findAncestorWithClass(this, FiniteResourceSplitIntoIterator.class);
			pageContext.getOut().print(theFiniteResourceSplitIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

