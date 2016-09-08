package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionAbsorbedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionAbsorbedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionAbsorbedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionAbsorbedByIterator theCollectionAbsorbedByIterator = (CollectionAbsorbedByIterator)findAncestorWithClass(this, CollectionAbsorbedByIterator.class);
			pageContext.getOut().print(theCollectionAbsorbedByIterator.getAbsorbedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

