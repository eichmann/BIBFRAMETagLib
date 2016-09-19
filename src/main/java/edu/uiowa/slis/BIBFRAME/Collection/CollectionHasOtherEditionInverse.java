package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasOtherEditionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionHasOtherEditionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasOtherEditionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasOtherEditionInverseIterator theCollectionHasOtherEditionInverseIterator = (CollectionHasOtherEditionInverseIterator)findAncestorWithClass(this, CollectionHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theCollectionHasOtherEditionInverseIterator.getHasOtherEditionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

