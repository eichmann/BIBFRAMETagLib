package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceSupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceSupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceSupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceSupersedesIterator theFiniteResourceSupersedesIterator = (FiniteResourceSupersedesIterator)findAncestorWithClass(this, FiniteResourceSupersedesIterator.class);
			pageContext.getOut().print(theFiniteResourceSupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

