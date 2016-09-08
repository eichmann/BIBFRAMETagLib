package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasFindingAidType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionHasFindingAidType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasFindingAidType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasFindingAidIterator theCollectionHasFindingAidIterator = (CollectionHasFindingAidIterator)findAncestorWithClass(this, CollectionHasFindingAidIterator.class);
			pageContext.getOut().print(theCollectionHasFindingAidIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

