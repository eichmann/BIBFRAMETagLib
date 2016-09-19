package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionFollowsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionFollowsType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionFollowsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionFollowsIterator theCollectionFollowsIterator = (CollectionFollowsIterator)findAncestorWithClass(this, CollectionFollowsIterator.class);
			pageContext.getOut().print(theCollectionFollowsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for follows tag ");
		}
		return SKIP_BODY;
	}
}

