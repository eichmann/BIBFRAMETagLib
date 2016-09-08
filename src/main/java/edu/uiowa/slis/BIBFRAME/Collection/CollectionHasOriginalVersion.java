package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasOriginalVersion extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionHasOriginalVersion currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasOriginalVersion.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasOriginalVersionIterator theCollectionHasOriginalVersionIterator = (CollectionHasOriginalVersionIterator)findAncestorWithClass(this, CollectionHasOriginalVersionIterator.class);
			pageContext.getOut().print(theCollectionHasOriginalVersionIterator.getHasOriginalVersion());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

