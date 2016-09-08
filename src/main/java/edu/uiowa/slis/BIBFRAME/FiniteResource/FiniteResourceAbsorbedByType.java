package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceAbsorbedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceAbsorbedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceAbsorbedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceAbsorbedByIterator theFiniteResourceAbsorbedByIterator = (FiniteResourceAbsorbedByIterator)findAncestorWithClass(this, FiniteResourceAbsorbedByIterator.class);
			pageContext.getOut().print(theFiniteResourceAbsorbedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

