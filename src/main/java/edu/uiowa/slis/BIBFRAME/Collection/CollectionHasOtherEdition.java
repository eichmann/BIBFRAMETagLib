package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasOtherEdition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionHasOtherEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasOtherEdition.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasOtherEditionIterator theCollectionHasOtherEditionIterator = (CollectionHasOtherEditionIterator)findAncestorWithClass(this, CollectionHasOtherEditionIterator.class);
			pageContext.getOut().print(theCollectionHasOtherEditionIterator.getHasOtherEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

