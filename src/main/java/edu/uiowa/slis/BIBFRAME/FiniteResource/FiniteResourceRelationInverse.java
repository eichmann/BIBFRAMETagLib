package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceRelationInverseIterator theFiniteResourceRelationInverseIterator = (FiniteResourceRelationInverseIterator)findAncestorWithClass(this, FiniteResourceRelationInverseIterator.class);
			pageContext.getOut().print(theFiniteResourceRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for relation tag ");
		}
		return SKIP_BODY;
	}
}

