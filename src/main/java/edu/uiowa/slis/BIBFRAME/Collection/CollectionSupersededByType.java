package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionSupersededByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionSupersededByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionSupersededByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionSupersededByIterator theCollectionSupersededByIterator = (CollectionSupersededByIterator)findAncestorWithClass(this, CollectionSupersededByIterator.class);
			pageContext.getOut().print(theCollectionSupersededByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

