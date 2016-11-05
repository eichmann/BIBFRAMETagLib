package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceRelationIterator theFiniteResourceRelationIterator = (FiniteResourceRelationIterator)findAncestorWithClass(this, FiniteResourceRelationIterator.class);
			pageContext.getOut().print(theFiniteResourceRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for relation tag ");
		}
		return SKIP_BODY;
	}
}

