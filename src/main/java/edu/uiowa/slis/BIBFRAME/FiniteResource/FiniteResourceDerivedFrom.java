package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceDerivedFromIterator theFiniteResourceDerivedFromIterator = (FiniteResourceDerivedFromIterator)findAncestorWithClass(this, FiniteResourceDerivedFromIterator.class);
			pageContext.getOut().print(theFiniteResourceDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

