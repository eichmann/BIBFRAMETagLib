package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicCreatedForDegreeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicCreatedForDegreeType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicCreatedForDegreeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicCreatedForDegreeIterator theNotatedMusicCreatedForDegreeIterator = (NotatedMusicCreatedForDegreeIterator)findAncestorWithClass(this, NotatedMusicCreatedForDegreeIterator.class);
			pageContext.getOut().print(theNotatedMusicCreatedForDegreeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

