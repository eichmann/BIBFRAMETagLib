package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasAbsorbedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasAbsorbedType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasAbsorbedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasAbsorbedIterator theFiniteResourceHasAbsorbedIterator = (FiniteResourceHasAbsorbedIterator)findAncestorWithClass(this, FiniteResourceHasAbsorbedIterator.class);
			pageContext.getOut().print(theFiniteResourceHasAbsorbedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

