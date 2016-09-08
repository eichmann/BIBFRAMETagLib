package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionRecordedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionRecordedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionRecordedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionRecordedAtIterator theCollectionRecordedAtIterator = (CollectionRecordedAtIterator)findAncestorWithClass(this, CollectionRecordedAtIterator.class);
			pageContext.getOut().print(theCollectionRecordedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

