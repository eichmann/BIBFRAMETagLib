package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionSupplementsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionSupplementsType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionSupplementsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionSupplementsIterator theCollectionSupplementsIterator = (CollectionSupplementsIterator)findAncestorWithClass(this, CollectionSupplementsIterator.class);
			pageContext.getOut().print(theCollectionSupplementsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for supplements tag ");
		}
		return SKIP_BODY;
	}
}

