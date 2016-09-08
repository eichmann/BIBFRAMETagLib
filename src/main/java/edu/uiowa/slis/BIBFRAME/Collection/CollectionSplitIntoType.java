package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionSplitIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionSplitIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionSplitIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionSplitIntoIterator theCollectionSplitIntoIterator = (CollectionSplitIntoIterator)findAncestorWithClass(this, CollectionSplitIntoIterator.class);
			pageContext.getOut().print(theCollectionSplitIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

