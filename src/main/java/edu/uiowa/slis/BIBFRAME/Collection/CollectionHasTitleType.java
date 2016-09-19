package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasTitleIterator theCollectionHasTitleIterator = (CollectionHasTitleIterator)findAncestorWithClass(this, CollectionHasTitleIterator.class);
			pageContext.getOut().print(theCollectionHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

